/*
 * Please do not edit this file.
 * It was generated using rpcgen.
 */

#include "rdbase.h"

bool_t
xdr_upd (XDR *xdrs, upd *objp)
{
	register int32_t *buf;

	 if (!xdr_string (xdrs, &objp->upd_old, MAXWORD))
		 return FALSE;
	 if (!xdr_string (xdrs, &objp->upd_new, MAXWORD))
		 return FALSE;
	return TRUE;
}