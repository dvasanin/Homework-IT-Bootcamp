package Domaci.Nedelja7.Sreda;

import java.util.ArrayList;
import java.util.Stack;
import java.util.TreeSet;

public class DomaciSreda {

    //1. Palacinke
    /*
     Palacinke <-> za zadati niz izbaciti poslednjih n elemenata i obrnuti ga

     Sara pravi palacinke sa dzemom, nutelom i sunkom za svoje drugare.
     Funkciji se prosledjuje niska sa vrsom palacinke koju je Sara napravila, odovjene novim redom, redom.
     kao i broj n koji oznacava koliko palacinaka ce pojesti Sarini prijatelji.
     Ispisati kojim redom ce koje palacinke Sara pojesti posle svojih drugara, ako znamo da ce da pojede sve koje ostanu.
    */

    public static String palacinke(String s, int n) {
        String[] palacinke = s.split("\n");
        Stack<String> tanjir = new Stack<>();
        String pojesti = "";
        for (String value : palacinke) {
            tanjir.push(value);
        }
        for (int i = 0; i < n; i++) {
            if (!tanjir.isEmpty()) {
                tanjir.pop();
            } else {
                pojesti = ":(";
            }
        }
        while (!tanjir.isEmpty()) {
            pojesti = pojesti.concat(tanjir.pop().concat("\n"));
        }
        return pojesti.trim();
    }

    //2. Istorija web pregledaca
    /*
    Прегледач веба памти историју посећених сајтова и корисник има могућност да се враћа унатраг на сајтове које је раније посетио.
    Написати програм који симулира историју прегледача тако што се учитавају адресе посећених сајтова (свака у посебном реду),
    а када се учита ред у коме пише back прегледач се враћа на последњу посећену страницу.
    Ако се наредбом back вратимо на почетну страницу, исписати -.
    Ако се на почетној страници изда наредба back, остаје се на почетној страници.
    Програм треба да испише све сајтове које је корисник посетио.
    Улаз: Са стандардног улаза се учитавају веб-адресе, свака у посебној линији, koje се даље уписују у String, свака у посебном реду.
    Излаз: Вратити String са исписаним сајтовима редом посећиваним.
    */

    public static String history(String search) {
        String[] niz = search.split("\n");
        Stack<String> sajtovi = new Stack<>();
        String input = "";
        for (String trenutni : niz) {
            if (!trenutni.equals("back")) {
                sajtovi.push(trenutni);
                input = input.concat(trenutni + "\n");
            } else {
                if (!sajtovi.isEmpty())
                    sajtovi.pop();
                if (sajtovi.isEmpty())
                    input += "-\n";
                else
                    input += sajtovi.peek() + "\n";
            }
        }
        return input.trim();
    }

    //3. Uparenost zagrada
    /*
    У изразу учествују следеће врсте заграда (, ), {, }, [ и ].
    Напиши програм који проверава да ли су у унетом изразу заграде исправно упарене.
    Улаз: Са стандардног улаза се уноси израз (цео у једном реду, без размака), које се даље уписују у String.
    Излаз: Boolean.
    */

    public static boolean uparenost(String s) {
        Stack<Character> stack = new Stack<>();
        for (char zagrada : s.toCharArray()) {
            if (zagrada == '(' || zagrada == '[' || zagrada == '{') {
                stack.push(zagrada);
            } else if (zagrada == ')' || zagrada == ']' || zagrada == '}') {
                if (stack.isEmpty())
                    return false;
                char a = stack.pop();
                if ((zagrada == ')' && a != '(') || (zagrada == ']' && a != '[') || (zagrada == '}' && a != '{'))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    //4. Uzastopni brojevi
    /*
    Низ се трансформише тако што се сваких 2 узастопних појављивања неког елемента бришу.
    Напиши програм који одређује садржај низа након исцрпне примене ове трансформације.
    Улаз:Са стандардног улаза се учитава елементи низа.
    Излаз: На стандардни излаз исписати елементе резултујућег низа, раздвојене размаком.
    NPR:
    [] -> "1 3 3 2 1"
    -ako je prazan = push
    -ako nije praza:
       -ako se gadjaju = pop
       -ako se ne gadjaju = {ubaci u resenje, popu, pushuj trenutni}
    ----------
    -ako stack nije prazan = ubaciti stack u resenje
    1 1 2 2 2 2 1 3 4 4 5 5 4 4 3 2 1 1 1
    ^
    "1 3 3 2 1"
    */

    public static String uzastopni(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        String res = "";
        for (int j : arr) {
            if (stack.isEmpty())
                stack.push(j);
            else {
                if (j == stack.peek()) {
                    if (!stack.isEmpty())
                        stack.pop();
                } else {
                    res += stack.pop() + " ";
                    stack.push(j);
                }
            }
        }
        while (!stack.isEmpty())
            res += stack.pop() + " ";
        return res.trim();
    }

    //5. Linijski editor
    /*
    Sa standardnog ulaza se unose niske karaktera koje opisuju neku akciju. Akcije su sledece:
    iX - korisnike je otkucao karakter X
    < - korisnik je pritisnuo taster levo
    > - korisnik je pritisnuo taster desno
    b - korisnik je pritisnuo taster backspace za brisanje karaktera iza kursora
    d - korisnik je pritisnuo taster delete za brisanje karaktera ispred kursora

    Vratiti String dobijen izvrsavanjem svih ackija

    NPR:
    iaib<bic>>
    cb

    Objasnjenje:
    Tekst     Naredba
     |         ia
     a|        ib
     ab|       <
     a|b       b
     |b        ic
     c|b       >
     cb|       >
     cb|
    */

    public static String console(String input) {
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'i':
                    left.push(input.charAt(i + 1));
                    i++;
                    break;
                case '<': // 123456
                    if (!left.isEmpty())
                        right.push(left.pop());
                    break;
                case '>':
                    if (!right.isEmpty())
                        left.push(right.pop());
                    break;
                case 'b':
                    if (!left.isEmpty())
                        left.pop();
                    break;
                case 'd':
                    if (!right.isEmpty())
                        right.pop();
                    break;
            }
        }
        while (!left.empty())
            right.push(left.pop());

        while (!right.empty())
            sb.append(right.pop());

        return sb.toString();
    }

    //6. Vrednost postfiksnog izraza
    /*
    Са стандардног улаза се учитава постфиксно записан израз
    који садржи једноцифрене бројеве и операторе +, -, * и / (без размака).
    Ispisati vrednost izraza

    NPR:
    12+3* --> (1+2)*3 -> 9
    */

    public static int eval(String s) {
        Stack<Integer> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c))
                stack.push(Character.getNumericValue(c));
            else {
                if (c == '+') {
                    stack.push(stack.pop() + stack.pop());
                } else if (c == '*') {
                    stack.push(stack.pop() * stack.pop());
                } else if (c == '-') {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                } else {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a / b);
                }
            }
        }
        return stack.pop();
    }

    //7. Berza
    /*
    Duzina Si cene neke hartije ne berzi je definisana kao najveci broj uzastopnih dana,
    pre datog dana, za koje je cena hartije manja ili jednaka trenutnoj ceni.
    Za dat niz cena jedne hartije, vratiti niz duzina Si za svaki od tih dana

    NPR:
    Cene po danima:      [100, 80, 60, 70, 60, 75, 85]
    Si duzine po danima: [  1,  1,  1,  2,  1,  4,  6]
    */

    public static int[] hartije(int... hartija) {

        int[] siLenght = new int[hartija.length];

        for (int i = hartija.length - 1; i >= 0; i--) {
            Stack<Integer> stack = new Stack<>();
            stack.push(hartija[i]);
            for (int j = i - 1; j >= 0; j--) {
                if (hartija[j] <= hartija[i]) {
                    stack.push(hartija[j]);
                    if (j == 0) {
                        siLenght[i] = stack.size();
                        break;
                    }
                } else {
                    siLenght[i] = stack.size();
                    break;
                }
            }
        }
        if (siLenght.length > 0)
            siLenght[0] = 1;
        if (siLenght.length == 0)
            return null;
        return siLenght;
    }

    // ------------------------------- //

    //1. Zajednicki elementi
     /*
     Za dva zadata niza bojeva vratiti niz onih brojeva koji se nalaze i u jednom i u drugom nizu.
     [1, 2, 3, 4, 5], [2, 4, 6, 8, 10] -> [2, 4]
     */

    public static ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b) {
        TreeSet<Integer> drvo = new TreeSet<>(a);
        ArrayList<Integer> skup = new ArrayList<>();
        for (Integer integer : b) {
            if (drvo.contains(integer)) {
                skup.add(integer);
            }
        }
        return skup;
    }

    //2. Svi elementi
    /*
    Za dva zadata niza brojeva vratiti niz svih brojeva iz oba niza bez ponavljanja.
    [1, 2, 3, 4, 5], [2, 4, 6, 8, 10] -> [1,2,3,4,5,6,8,10]
    */

    public static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b) {
        TreeSet<Integer> drvo = new TreeSet<>(a);
        drvo.addAll(b);
        return new ArrayList<>(drvo);
    }

    //3. Razlika
    /*
    Za dva zadata niza brojeva vratiti niz onih brojeva koji se nalaze u prvom
    ali ne i u drugom nizu, bez ponavljanja
    */

    public static ArrayList<Integer> razlika(ArrayList<Integer> a, ArrayList<Integer> b) {
        TreeSet<Integer> drvo = new TreeSet<>(a);
        for (int i = 0; i < drvo.size(); i++) {
            for (Integer integer : b) {
                drvo.remove(integer);
            }
        }
        return new ArrayList<>(drvo);
    }

    //4. Duplikati
    /*
    Napisati funkciju koja broji koliko ima duplikata u zadatom nizu.
    [1, 2, 3, 4, 4, 2, 3, 5, 6] -> 3
    [1, 2, 3] -> 0
    [5, 5, 5, 5, 5, 6] -> 4
    */

    public static int ponavljanjeBroj(int[] duplikati) {
        TreeSet<Integer> drvo = new TreeSet<>();
        int counter = 0;
        for (int j : duplikati) {
            if (drvo.add(j)) {
                counter++;
            }
        }
        return duplikati.length - counter;
    }

    //5. Provera permutacije
    /*
    Za dva zadata niza brojeva proveriti da li moze da se jedan dobije od drugog.
    Brojevi u nizu se ne ponavljaju.
    [1, 2, 221, 101], [101, 2, 221, 1] -> da
    [1, 2, 3], [3, 1, 2, 4] -> ne
    */

    public static boolean permutacija(ArrayList<Integer> p1, ArrayList<Integer> p2) {
        TreeSet<Integer> drvo = new TreeSet<>(p1);
        TreeSet<Integer> drvo1 = new TreeSet<>(p2);
        if (drvo.size() != drvo1.size()) {
            return false;
        } else {
            return drvo.containsAll(drvo1);
        }
    }

    //6. Neuparen element
    /*
    Funkciji se prosledjuje niz ciji se svi elementi ponavljaju tacno dva puta,
    osim jednog koji se ponavlja samo jednom.
    Vratiti taj element
    [1, 1, 2, 3, 3, 4, 4] -> 2
    */

    public static int neuparen(int[] x) {
        TreeSet<Integer> drvo = new TreeSet<>();
        for (int j : x) {
            if (!drvo.add(j))
                drvo.remove(j);
        }
        return drvo.first();
    }

    //7. Anagram
    /*
    Funkcija prima 2 String i daje odgovor da/ne u odnosu na to da li je
    jedan String anagram drugog.

    "panta redovno zakasni" ptredvzksi
    neopravdan izostanak eprvdizstk
    Da
    */

    public static boolean anagram(String s1, String s2) {
        if (s1.length() == s2.length()){
            return false;
        }
        s1 = s1.replaceAll(" ", "");
        s2 = s2.replaceAll(" ", "");
        char[] niska1 = s1.toCharArray();
        char[] niska2 = s2.toCharArray();
        TreeSet<Character> drvo = new TreeSet<>();
        TreeSet<Character> drvo1 = new TreeSet<>();
        for (char c : niska1) {
            drvo.add(c);
        }
        for (char c : niska2) {
            drvo1.add(c);
        }
        return drvo.containsAll(drvo1);
    }
}
