/* SQL e11 — WHERE + ORDER BY em duas tabelas
   a) Na tabela animes: liste o titulo e a nota dos animes do gênero 'Isekai', ordenados por nota decrescente.
   b) Na tabela avaliacoes: liste o anime_id, a nota e a data_avaliacao das avaliações do usuário 'Junior', ordenadas por nota decrescente.
*/

SELECT titulo, nota FROM animes WHERE genero = 'Isekai' ORDER BY nota DESC;
SELECT anime_id, nota, data_avaliacao FROM avaliacoes WHERE usuario = 'Junior' ORDER BY nota DESC;
