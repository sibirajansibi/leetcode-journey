SELECT  p.firstname ,p.lastname,a.state,a.city
FROM person p 
LEFT JOIN address a 
ON p.personID = a.personId;