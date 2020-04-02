#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>

#include "clientes.h"
#include "produtos.h"
#include "faturacao.h"
#include "filiais.h"
#include "vendas.h"
#include "queries.h"

#define SIZE_CL 1000000
#define SIZE_PR 1000000
#define SIZE_VD 1000000

void prettyprintmenu(){
	printf("op1->blah\n");
}

int alldigits(char* buf){
	int flag=1;
	for(int i=0;i<strlen(buf)&&flag;i++){
		flag=isdigit(buf[i]);
	}
	return flag;
}

int toint(char* buf){
	if(!alldigits(buf))return -1;
	else return atoi(buf);
}

void flush(){
	printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
}

int main(){

	int p=0;
	char letra = 'D';
	SGV sgv = initSGV();
	sgv = loadSGVFromFiles(sgv, "Dados_Iniciais");
	//p = getProductsStartedByLetter(sgv, letra);



	char buf[10];
	int op;
	do{
		flush();
		prettyprintmenu();
		printf("A sua opção: ");
		scanf("%10s",buf);
		getchar();//gets the enter

		op=toint(buf);
		printf("%d\n", op);
		
		//switch op

		printf("\n");
		printf("press Enter to continue");
		getchar();//pausa para observar o resultado

	}while(op);




	//p = getProductsSalesAndProfit( sgv, "BR1925", 2, 1);
	//p = getProductsNeverBought(sgv,1);
	//p = getClientsOfAllBranches(sgv);
	
	return p;
}
