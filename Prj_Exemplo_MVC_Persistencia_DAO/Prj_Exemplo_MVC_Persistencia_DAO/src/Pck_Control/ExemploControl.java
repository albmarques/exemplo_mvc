package Pck_Control;

import Pck_Model.ExemploModel;
import Pck_Persistencia.ExemploPersitencia;
public class ExemploControl {
	//Declarando o objeto
	ExemploModel oExemploModel = new ExemploModel();
	ExemploPersitencia oExemploPersitencia = new ExemploPersitencia();
	
	public void inserirExemplo(String sNome) {
		oExemploModel.setA01_nome(sNome);
		oExemploPersitencia.inserirExemplo(oExemploModel);
	}
	
	public void atualizarExemplo(String sNome,int iCodigo) {
		oExemploModel.setA01_nome(sNome);
		oExemploModel.setA01_codigo(iCodigo);
	}
	
	public void deletarrExemplo(int iCodigo) {
		oExemploModel.setA01_codigo(iCodigo);
	}
	
	
	
}
