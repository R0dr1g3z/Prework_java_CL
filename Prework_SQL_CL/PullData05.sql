SELECT *
FROM students
WHERE class_id = 5
AND surname NOT LIKE '%ski'
ORDER BY surname ASC;