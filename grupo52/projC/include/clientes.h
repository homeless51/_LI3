/* File clientes  */
#ifndef _CLIENTES_
#define _CLIENTES_

#define HSIZE 26

typedef struct elem{
	int used;
	char *id;
}Elem;

typedef struct bucket{
	int size;
	Elem *arr;
} Bucket ;


typedef struct thash{
	int size;
	Bucket *tbl;
} THash;


//typedef Bucket THash[HSIZE];

int ler_clientes (THash *cliente, int size);
//void swapc(Elem *arg1, Elem *arg2);
void quicksortc(Elem *args, unsigned int len);

int validacliente(char *cliente);
int letra_cl(THash *cliente, char *letra);


int hash(char *cliente);
//void initTab(THash *h);
THash* initTab();
void acrecenstaTab(THash *h, char *cliente);
void imprimecliente(THash *h);
void distroiTab(THash *h);


void escrever_c(THash *h , char *s);
//void ultimoElemTB(THash *h, char* r);


#endif /* _CLIENTES_ */