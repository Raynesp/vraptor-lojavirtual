   1. function validaForm(){    
   2.   
   3.     if(document.getElementById("cd_titulo").value == ""){  
   4.         alert("O campo titulo deve ser preenchido!");  
   5.         document.getElementById("cd_titulo").focus();  
   6.         return false;  
   7.     }  
   8.   
   9.     return true;  
  10. }  
  11.   
  12. function recarrega(){  
  13.     alert("CD cadastrado/atualizado com sucesso!!");  
  14. }  