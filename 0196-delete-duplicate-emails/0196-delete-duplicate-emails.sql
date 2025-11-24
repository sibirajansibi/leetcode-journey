

DELETE k1
FROM Person k1
JOIN Person k2
ON k1.email = k2.email
AND k1.id > k2.id;
