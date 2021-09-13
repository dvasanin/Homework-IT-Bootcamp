SELECT * FROM profesori WHERE godine > 45;

SELECT ime, prezime FROM ucenici WHERE godine > 16 AND prosek > 6.5;

SELECT godine from ucenici ORDER BY godine DESC;

SELECT * FROM profesori WHERE predmet = 'informatika';

SELECT ucenikid, ime, prezime FROM ucenici WHERE LENGTH(ime) = 6;
