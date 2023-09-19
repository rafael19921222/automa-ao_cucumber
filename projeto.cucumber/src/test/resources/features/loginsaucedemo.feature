#Author: rafael_viana20@hotmail.com


Feature: Realizar login no site saucedmo
  Como ususario do site saucedemo
  Quero informar os dados de acesso
  Para acessar a conta 

  Scenario: Login valido
   Given que esteja na tela de login
   When enviar os dados de login
   Then login realizado com sucesso
   

 