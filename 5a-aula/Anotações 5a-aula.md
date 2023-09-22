1.  `.this` não é utilizado em **static**
2. Toda classe possui um construtor, caso não for informado o java inclui um construtor padrão (vazio) para alocação de memória no hardware. 
---
>[!important] Possível questão de prova
>```java
Pessoa{
String = "Maria";
Int idade;
Pessoa (){
 Idade=5;
 }
 Pessoa (String nome){
 This. Nome=nome;
 }
}

---
```java
Pessoa{
String = "Maria";
int idade;
Pessoa(){
 idade=5;
 }
 Pessoa(String nome){
 this.nome=nome;
 }
}
```


