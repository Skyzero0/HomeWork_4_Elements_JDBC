SELECT name, salary FROM worker
GROUP BY name
HAVING salary IN (
   SELECT salary FROM worker
   ORDER BY salary DESC
   LIMIT 1
);