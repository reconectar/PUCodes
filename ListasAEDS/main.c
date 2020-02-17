#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>

int pvolume(){

    int r,h;
    float V;
    printf("\nInsira o valor da altura: ");
    scanf("%d" ,&h);
    printf("\nInsira o valor do raio: ");
    scanf("%d" ,&r);
    V=(pow(r,2))*h*(3.141592);
    printf("\nO valor do volume é: %.2f",V);

    return 0;
}

int ppagamento(){

    float pag;
    int dias;
    printf("\nInsira quantos dias de trabalho: ");
    scanf("%d",&dias);
    pag=dias*20*0.92;
    printf("\nO pagamento a ser recebido será %.2f\n", pag);

    return 0;
}

int pmaioridade(){
    int idade;
    printf("Insira uma idade: ");
    scanf("%d",&idade);
    if(idade>=18){
        printf("\nÉ maior de idade\n");
    }else{
        printf("\nÉ menor de idade\n");
    }
}

int pparimpar(){
    int n;
    printf("Insira numero: ");
    scanf("%d",&n);
    n=n%2;
    if(n==1){
        printf("\nEle é impar\n");
    }else{
        printf("\nEle é par\n");
    }
    return 0;
}

int pmenulanchonete(){
    int n;
    printf("\nEscolha o numero do item do menu para ver sua descricao (de 1 a 5): ");
    scanf("%d",&n);
    switch (n){
        case 1:
        printf("\nHamburguer R$ 30,00\n");
        break;
        case 2:
        printf("\nCheeseburguer R$ 35,50\n");
        break;
        case 3:
        printf("\nFritas R$ 20,50\n");
        break;
        case 4:
        printf("\nRefrigerante R$ 10,00\n");
        break;
        case 5:
        printf("\nMilkShake R$ 30,00\n");
        break;
        default:
        printf("\nNumero invalido\n");
    }
    return 0;
}

int pcontalanchonete(){

    float pag;
    int H,R,M,C,F;
    printf("\nInsira quantos hamburgueres foram consumidos: ");
    scanf("%d",&H);
    printf("\nInsira quantos refrigerantes foram consumidos: ");
    scanf("%d",&R);
    printf("\nInsira quantos milk shakes foram consumidos: ");
    scanf("%d",&M);
    printf("\nInsira quantos cheeseburgueres foram consumidos: ");
    scanf("%d",&C);
    printf("\nInsira quantos fritas foram consumidas: ");
    scanf("%d",&F);
    pag=(H*30.0)+(C*35.5)+(F*20.5)+(R*10.0)+(M*30.0);
    printf("\nO pagamento a ser recebido será %.2f", pag);

    return 0;
}

int letraA(){
    int a;
    printf("\nInsira um numero inteiro: ");
    scanf("%d",&a);
    printf("\nO termo sucessor é %d\n",a+1);

    return 0;
}

int letraB(){
    float a,b,c,d,media;
    printf("\nInsira 4 numeros:\n");
    scanf("%f %f %f %f",&a,&b,&c,&d);
    media=(a+b+c+d)/4;
    printf("\nA média é igual a %f\n", media);

    return 0;
}

int letraC(){
    float n1,n2,n3,p1,p2,p3,r;
    printf("\nInsira 3 numeros:\n");
    scanf("%f %f %f",&n1,&n2,&n3);
    printf("\nInsira seus respectivos pesos (na mesma ordem anteriormente inserida):\n");
    scanf("%f %f %f",&p1,&p2,&p3);
    r=(n1*p1+n2*p2+n3*p3)/(p1+p2+p3);
    printf("\nA média ponderada é igual a %.2f\n", r);

    return 0;
}

int letraD(){
    float c1,c2,f;
    printf("\nInsira a temperatura em C a ser convertida para F:\n");
    scanf("%f",&c1);
    f=(9.0/5.0)*c1+32.0;
    c2=(f-32)*5.0/9.0;
    if(c1==c2){
        printf("\nO valor equivalente é %.2f\n", f);
    }
    if(c1!=c2){
        printf("\nErro!\n");
    }

    return 0;
}

int letraE(){
    float S,PA;
    printf("\nInsira o salário: ");
    scanf("%f",&S);
    printf("\nInsira o percentual de aumento: ");
    scanf("%f", &PA);
    S=S*(1.0+PA/100.0);
    printf("\nO novo salário é %.2f\n", S);

    return 0;
}

int letraF(){
    float b,h;
    printf("\nInsira a altura do triangulo: ");
    scanf("%f",&h);
    printf("\nInsira base do triangulo: ");
    scanf("%f", &b);
    b=b*h/2;
    printf("\nA area do triangulo é %.2f\n", b);

    return 0;
}

int letraG(){
    int g1,g2;
    float p;
    printf("\nInsira o peso do saco de reçao em kg: ");
    scanf("%f",&p);
    p=p*1000.0;
    printf("\nInsira quantas gramas de raçao consome por dia o primeiro gato: ");
    scanf("%d", &g1);
    printf("\nInsira quantas gramas de raçao consome por dia o segundo gato: ");
    scanf("%d", &g2);
    p=p-(g1+g2)*5;
    printf("\nO restante do saco após 5 dias será %.0f gramas\n", p);

    return 0;
}

int letraH(){
    int a,b,c;
    printf("\nInsira dois numeros a serem trocados nas variaveis =]\n");
    scanf("%d %d" ,&a,&b);
    c=a;
    a=b;
    b=c;
    printf("%d e %d",a,b);

    return 0;
}

int letraI(){
    int a,b;
    printf("\nInsira o dividendo: ");
    scanf("%d" ,&a);
    printf("\nInsira o divisor: ");
    scanf("%d" ,&b);
    b=a%b;
    printf("\nO resto da divisao é %d",b);

    return 0;
}

int letraJ(){
    int a1,r,n,S;
    printf("\nInsira o primeiro termo da PA");
    scanf("%d" ,&a1);
    printf("\nInsira o segundo termo da PA");
    scanf("%d" ,&r);
    r=r-a1;
    printf("\nInsira quantos termos possui a PA");
    scanf("%d" ,&n);
    S=n*(a1+a1+(n-1)*r)/2;
    printf("\nA soma dos termos da PA é igual a %d", S);

    return 0;
}

int numero1(){
    pparimpar();
}

int numero2(){
    float n1,n2,n3,media;
    char nome[50];
    printf("\nInsira o nome do aluno: ");
    scanf("%s",nome);
    printf("\nInsira as 3 notas do aluno: ");
    scanf("%f %f %f",&n1,&n2,&n3);
    media=(n1+n2+n3)/3;
    if(media>=6){
        printf("\nAluno aprovado");
    }else{
        printf("\nAluno reprovado");
    }

    return 0;
}

int numero3(){
    int t;
    printf("\nInsira uma temperatura da água: ");
    scanf("%d",&t);
    if(t<100){
        if(t<=0){
            printf("\nEstado sólido");
        }else{
            printf("\nEstado líquido");
        }
    }else{
        printf("\nEstado gasoso");
    }
    return 0;
}

int numero4(){
    int x;
    printf("\nInsira o valor de X: ");
    scanf("%d",&x);
    if(x!=0){
        if(x>0){
            x=x*2+4;
            printf("\nY = %d",x);
        }if(x<0){
            x=x*3-3;
            printf("\nY = %d",x);
        }
    }else{
        printf("\nerro");
    }
    return 0;
}

int numero5(){
    float a,b,c,x;
    printf("Insira 3 valores: ");
    scanf("%f %f %f",&a,&b,&c);
    if(a>b){
        x=a;
        a=b;
        b=x;
    }if(b>c){
        x=b;
        b=c;
        c=x;
        if(a>b){
            x=a;
            a=b;
            b=x;
        }
    }
    printf("Os valores em ordem crescente sao %f %f %f",a,b,c);
    return 0;
}

int numero6(){
    int x,y,z;
    printf("Insira os valores de X, Y e Z respectivamente: ");
    scanf("%d %d %d",&x,&y,&z);
    if((x%y==0)||(x%z==0)){
        if(x%y==0){
            if(x%z==0){
                printf("X é divisivel por Y e Z");
            }else{
                printf("X é apenas divisivel por Y");
            }
        }if(x%z==0){
            if(x%y!=0){
                printf("X é apenas divisivel por Z");
            }
        }
    }else{
        printf("X nao é divisivel por Y ou Z");
    }
    return 0;
}

int numero7(){
    int n,metade1,metade2,r;
    printf("Insira um numero de 4 digitos: ");
    scanf("%d",&n);
    metade1=n/100;
    metade2=n-metade1*100;
    r=metade1+metade2;
    r*=r*r;
    if(n==r){
        printf("Ele possui a tal caracteristica! (%d = %d)",n,r);
    }else{
        printf("Ele nao possui a tal caracteristica! (%d != %d)",n,r);
    }
    return 0;
}

int numero8(){
    int vc,vr,t,n1,n10,n100;
    printf("\nInsira o valor da compra: ");
    scanf("%d",&vc);
    printf("\nInsira o valor recebido: ");
    scanf("%d",&vr);
    t=vr-vc;
    if(t<0){
        printf("\nNot enough gold!");
    }else{
        n1=t%10;
        n10=(t%100-n1)/10;
        n100=t/100;
        printf("\nO valor da compra foi $%d, o troco será de $%d",vc,t);
        if(n100>0){
            printf(", %d nota(s) de $100",n100);
        }if(n10>0){
            printf(", %d nota(s) de $10",n10);
        }if(n1>0){
            printf(", %d nota(s) de $1",n1);
        }
    }
    return 0;
}

int numero9(){
    int n,parte1,meio,parte2;
    printf("Insira um numero de 5 digitos: ");
    scanf("%d",&n);
    parte1=n/1000;
    meio=(n-parte1*1000)/100;
    parte2=n-(parte1*1000)-(meio*100);
    meio=parte2/10;
    parte2=parte2-meio*10;
    parte2=parte2*10+meio;
    if(parte1==parte2){
        printf("%d é palindromo",n);
    }else{
        printf("%d não é palindromo",n);
    }
    return 0;
}

int numero10(){
    int tipo,consumo;
    float conta;
    printf("\n1. Residencial");
    printf("\n2. Comercial");
    printf("\n3. Industrial");
    printf("\nInsira qual tipo de cliente deseja calcular a conta de agua: ");
    scanf("%d", &tipo);
    printf("\nInsira a quantidade de agua em metros cubicos consumida: ");
    scanf("%d", &consumo);
    switch(tipo){
        case 1:
            conta=15.0+0.5*consumo;
            break;
        case 2:
            if(consumo>80){
                conta=500+2.5*(consumo-80);
            }else{
                conta=500;
            }
            break;
        case 3:
            if(consumo>100){
                conta=800.0+4.0*(consumo-100);
            }else{
                conta=800.0;
            }
            break;
    }
    printf("\nO valor da conta será: $%.2f",conta);

    return 0;
}

int menu(){
    int n;

    printf("\n1. Programa da volume do cilindro");
    printf("\n2. Programa do pagamento do trabalho");
    printf("\n3. Programa da maioridade");
    printf("\n4. Programa do par ou impar");
    printf("\n5. Programa do menu da lanchonete");
    printf("\n6. Programa da conta da lanchonete");
    printf("\n7. Primeira lista de exercicios");
    printf("\n8. Segunda lista de exercicios");
    printf("\n\nInsira o numero do exercicio que deseja: ");
    scanf("%d",&n);

    switch(n){
        case 1:
            pvolume();
            break;
        case 2:
            ppagamento();
            break;
        case 3:
            pmaioridade();
            break;
        case 4:
            pparimpar();
            break;
        case 5:
            pmenulanchonete();
            break;
        case 6:
            pcontalanchonete();
            break;
        case 7:
            system("cls");
            printf("\n1. Programa da letra A da lista de exercicios");
            printf("\n2. Programa da letra B da lista de exercicios");
            printf("\n3. Programa da letra C da lista de exercicios");
            printf("\n4. Programa da letra D da lista de exercicios");
            printf("\n5. Programa da letra E da lista de exercicios");
            printf("\n6. Programa da letra F da lista de exercicios");
            printf("\n7. Programa da letra G da lista de exercicios");
            printf("\n8. Programa da letra H da lista de exercicios");
            printf("\n9. Programa da letra I da lista de exercicios");
            printf("\n10. Programa da letra J da lista de exercicios");
            printf("\n\nInsira o numero do exercicio que deseja: ");
            scanf("%d",&n);
            switch(n){
                case 1:
                    letraA();
                    break;
                case 2:
                    letraB();
                    break;
                case 3:
                    letraC();
                    break;
                case 4:
                    letraD();
                    break;
                case 5:
                    letraE();
                    break;
                case 6:
                    letraF();
                    break;
                case 7:
                    letraG();
                    break;
                case 8:
                    letraH();
                    break;
                case 9:
                    letraI();
                    break;
                case 10:
                    letraJ();
                    break;
                default:
                    printf("\nInsira um numero válido\n");
                    system("pause");
                    system("cls");
                    menu();
            }
            break;
        case 8:
            system("cls");
            printf("\n1. Programa numero 1 da lista de exercicios");
            printf("\n2. Programa numero 2 da lista de exercicios");
            printf("\n3. Programa numero 3 da lista de exercicios");
            printf("\n4. Programa numero 4 da lista de exercicios");
            printf("\n5. Programa numero 5 da lista de exercicios");
            printf("\n6. Programa numero 6 da lista de exercicios");
            printf("\n7. Programa numero 7 da lista de exercicios");
            printf("\n8. Programa numero 8 da lista de exercicios");
            printf("\n9. Programa numero 9 da lista de exercicios");
            printf("\n10. Programa numero 10 da lista de exercicios");
            printf("\n\nInsira o numero do exercicio que deseja: ");
            scanf("%d",&n);
            switch(n){
                case 1:
                    numero1();
                    break;
                case 2:
                    numero2();
                    break;
                case 3:
                    numero3();
                    break;
                case 4:
                    numero4();
                    break;
                case 5:
                    numero5();
                    break;
                case 6:
                    numero6();
                    break;
                case 7:
                    numero7();
                    break;
                case 8:
                    numero8();
                    break;
                case 9:
                    numero9();
                    break;
                case 10:
                    numero10();
                    break;
                default:
                    printf("\nInsira um numero válido\n");
                    system("pause");
                    system("cls");
                    menu();
            }
            break;
        default:
            printf("\nInsira um numero válido\n");
            system("pause");
            system("cls");
            menu();
    }
    return 0;
}

int main(){
    setlocale(LC_ALL, "portuguese");
    int n=0;
    menu();
    while(n!=2){
        printf("\nDeseja executar outro programa?");
        printf("\n1.Sim");
        printf("\n2.Nao\n");
        scanf("%d",&n);
        system("cls");
        if(n==1){
            menu();
        }else{
            printf("Fim do programa");
            return 0;
        }
    }
}

