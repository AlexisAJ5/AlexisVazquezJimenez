var textos = ["Este es el primer texto.", "Este es el segundo texto.", "Este es el tercer texto."]; // Modifica este array para incluir tus textos
var indice = 0;
var texto = document.getElementById("texto");

setInterval(function() {
  texto.innerHTML = textos[indice];
  indice++;
  if (indice >= textos.length) {
    indice = 0;
  }
}, 3000); //

