SELECT CONCAT('Project ', id) AS NAME, DATEDIFF(MONTH, start_date, finish_date) MONTH_COUNT FROM project
WHERE DATEDIFF(MONTH, start_date , finish_date) IN (
    SELECT MAX (DATEDIFF(MONTH, start_date, finish_date)) FROM project
);