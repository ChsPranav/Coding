# Write your MySQL query statement below
SELECT id ,'Root'as type FROM Tree Where p_id IS null UNION
(SELECT id,'Inner'as type FROM Tree  WHERE id  In(select Distinct p_id FROM Tree WHERE  p_id IS NOT NULL) AND p_id IS NOT null) UNION
(SELECT id,'Leaf'as type FROM Tree  WHERE id  NOT In(select Distinct p_id FROM Tree WHERE  p_id IS NOT NULL) AND p_id IS NOT null) ORDER BY id;
