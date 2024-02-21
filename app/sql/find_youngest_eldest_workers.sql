SELECT 'YOUNGEST' TYPE, name, birthday FROM worker
GROUP BY name
HAVING birthday IN(
    SELECT MAX (birthday) FROM worker
)
UNION
SELECT 'OLDEST' TYPE, name, birthday FROM worker
GROUP BY name
HAVING birthday IN (
    SELECT MIN (birthday) FROM worker
) ORDER BY TYPE DESC;