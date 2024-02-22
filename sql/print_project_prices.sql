SELECT CONCAT ('Project ', project_id) AS NAME, SUM (salary)*DATEDIFF(MONTH, start_date, finish_date) AS PRICE
FROM worker W, project_worker PW, project P
WHERE PW.worker_id =W.id AND PW.project_id = P.id
GROUP BY project_id
ORDER BY PRICE DESC;