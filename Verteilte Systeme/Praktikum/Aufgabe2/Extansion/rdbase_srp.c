/* rdbase_srp.c - initw, insertw, deletew, lookupw */

#include <rpc/rpc.h>

#include "rdbase.h"
char dbase[DBASESIZE] [MAXWORD+1];
int  nwords = 0;

int countw(){
   int count = 0;
    return sizeof dbase;
}

int initw() {
   nwords = 0;
   return 1;
}

int insertw (word)
char *word;
{
   int i;
   for (i=0; i<nwords; i++)
      if (strcmp (word, dbase[i]) == 0)
         return 0;
   strcpy (dbase[nwords], word);
   nwords++;
   return nwords;
}

int deletew (word)
char *word;
{
   int i;
   for (i=0; i<nwords; i++)
      if (strcmp (word, dbase[i]) == 0) {
         nwords--;
         strcpy (dbase[i], dbase[nwords]);
         return 1;
      }
   return 0;
}

int lookupw (word)
char *word;
{
   int i;
   for (i=0; i<nwords; i++)
      if (strcmp (word, dbase[i]) == 0)
         return 1;
   return 0;
}

int updatew (word, word2)
char *word, *word2;
{
   int i;
   for (i=0; i<nwords; i++)
      if (strcmp (word, dbase[i]) == 0) {
         strcpy (dbase[i], word2);
         return 1;
      }
   return 0;
}




