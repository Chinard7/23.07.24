import java.sql.*;

public class InserirRegistro {

    public static void main(String[] args) throws SQLException {

        try {
            Connection conexao = MySQLConector.conectar();
            String strSqlCriarBancoDeDados = "insert into `db_teste`.`tbl_teste` (`nome`,`senha`) values ('Teste', 'senhaTeste')";
            Statement stmSqlCriarBancoDeDados = conexao.createStatement();

            stmSqlCriarBancoDeDados.addBatch(strSqlCriarBancoDeDados);
            stmSqlCriarBancoDeDados.executeBatch();
            stmSqlCriarBancoDeDados.close();

            System.out.println("Registro Inserido Com Sucesso :) ");

        } catch (Exception e) {
            System.out.println("Ops! ocorreu um erro:" + e);

        }
    }
}