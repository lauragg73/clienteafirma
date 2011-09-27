/*
 * Este fichero forma parte del Cliente @firma.
 * El Cliente @firma es un aplicativo de libre distribucion cuyo codigo fuente puede ser consultado
 * y descargado desde www.ctt.map.es.
 * Copyright 2009,2010,2011 Gobierno de Espana
 * Este fichero se distribuye bajo  bajo licencia GPL version 2  segun las
 * condiciones que figuran en el fichero 'licence' que se acompana. Si se distribuyera este
 * fichero individualmente, deben incluirse aqui las condiciones expresadas alli.
 */

package es.gob.afirma.envelopers.cms;

import es.gob.afirma.core.AOException;

/** Excepci&oacute;n para indicar que se ha intentado abrir un sobre digital con
 * un certificado que no estaba entre sus destinatarios. */
public final class AOInvalidRecipientException extends AOException {

    private static final long serialVersionUID = 2582498859303039013L;

    /** Crea la excepci&oacute;n con un mensaje determinado.
     * @param msg
     *        Mensaje descriptivo de la excepci&oacute;n. */
    AOInvalidRecipientException(final String msg) {
        super(msg);
    }


}
