SELECT name, COUNT(P.id) AS PROJECT_COUNT FROM client C
JOIN project P ON C.id = P.client_id
WHERE C.id IN (
   SELECT client_id FROM PROJECT
   GROUP BY client_id
   HAVING COUNT(P.id) IN (
     SELECT COUNT(P.id) 
     FROM project GROUP BY client_id
     ORDER BY COUNT(P.id) DESC
     LIMIT 1
   )
)
GROUP BY C.id;