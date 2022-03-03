package br.edu.pucgoias.cmp1138;

public class PrincipalStringBuilder {

    public static void main(String args[]){

        String tabela = "funcionario";
        String orderBy = " ORDER BY nome";

        StringBuilder sql = new StringBuilder("SELECT cpf, nome ");

        sql.append("FROM ");
        sql.append(tabela);
        sql.append(" WHERE sexo = 'M'").append(orderBy);

        System.out.println(sql);

    }
}
