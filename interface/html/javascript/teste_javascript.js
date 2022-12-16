function exibe_conteudo1(){
    document.getElementById("conteudo1").style.visibility="visible";
    document.getElementById("conteudo2").style.visibility="hidden";
    document.getElementById("conteudo3").style.visibility="hidden";
}

function exibe_conteudo2(){
    document.getElementById("conteudo1").style.visibility="hidden";
    document.getElementById("conteudo2").style.visibility="visible";
    document.getElementById("conteudo3").style.visibility="hidden";
}

function exibe_conteudo3(){
    document.getElementById("conteudo1").style.visibility="hidden";
    document.getElementById("conteudo2").style.visibility="hidden";
    document.getElementById("conteudo3").style.visibility="visible";
}

function some_tudo(){
    document.getElementById("conteudo1").style.visibility="hidden";
    document.getElementById("conteudo2").style.visibility="hidden";
    document.getElementById("conteudo3").style.visibility="hidden";
}