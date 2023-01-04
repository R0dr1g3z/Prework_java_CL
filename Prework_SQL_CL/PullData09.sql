SELECT CONCAT(UPPER(LEFT(name, 2)), UPPER(LEFT(surname, 2)))
FROM students
ORDER BY surname DESC;