SELECT  p.firstname ,p.lastname,a.state,a.city
from person p 
LEFT JOIN address a on p.personID = a.personId;