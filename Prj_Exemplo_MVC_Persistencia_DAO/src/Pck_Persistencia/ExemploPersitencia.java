package Pck_Persistencia;
import Pck_DAO.Conexao_DAO;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Pck_Model.ExemploModel;

public class ExemploPersitencia {
	CallableStatement oCall;
	Conexao_DAO oConectar = new Conexao_DAO();
	PreparedStatement oPrepared;
	ResultSet oResultSet;

	public void inserirExemplo(ExemploModel oExemploModel) {
		try {
			try {
				oCall = oConectar.getConexao().prepareCall("CALL PROC_INSEXEMPLO(?)");
						oCall.setString(1,oExemploModel.getA01_nome());
						oCall.execute();
			} catch (SQLException e) {e.printStackTrace();}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
