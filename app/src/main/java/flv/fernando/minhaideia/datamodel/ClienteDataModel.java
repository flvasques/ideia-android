package flv.fernando.minhaideia.datamodel;

import android.util.Log;

import flv.fernando.minhaideia.core.AppUtil;

public class ClienteDataModel {

    public static final String TABELA = "cliente";

    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String EMAIL = "email";
    public static final String TELEFONE = "telefone";
    public static final String IDADE = "idade";
    public static final String SEXO = "sexo";

    private static String queryCriarTabela = "";

    public static String criarTabela() {
        queryCriarTabela += "CREATE TABLE " + TABELA + " ( ";
        queryCriarTabela += ID + " INTEGER PRIMARY KEY AUTOINCREMENT, ";
        queryCriarTabela += NOME + " TEXT, ";
        queryCriarTabela += EMAIL + " TEXT, ";
        queryCriarTabela += TELEFONE + " TEXT, ";
        queryCriarTabela += IDADE + " INTEGER, ";
        queryCriarTabela += SEXO + " INTEGER ) ";

        Log.d(AppUtil.TAG, "criarTabela: " + queryCriarTabela);

        return queryCriarTabela;
    }

}
