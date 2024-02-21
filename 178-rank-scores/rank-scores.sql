# Write your MySQL query statement below
SELECT S.Score ,COUNT(S2.Score) As `Rank` from Scores S,
(SELECT DISTINCT Score FROM Scores)S2
Where S.Score<=S2.Score
Group by S.id
Order by S.Score desc;