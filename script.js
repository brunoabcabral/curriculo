//*@Author bruno*/
// Selecionar o botão pelo seu id
var botao = document.getElementById("mudar-cor");

// Adicionar um evento de clique ao botão
botao.addEventListener("click", function() {
    // Gerar muda para padrao
    var cor = "#" + Math.floor(Math.random() * 16777215).toString(16);
    // Alterar a cor de fundo do body para a cor gerada
    document.body.style.backgroundColor = cor;
    // Exibir um alerta com a cor gerada
    alert("A cor de fundo mudou para " + cor);
    document.cookie = "nome= cokkie.java"
});
