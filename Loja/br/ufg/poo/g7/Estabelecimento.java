package br.ufg.poo.g7;
import java.util.Date;
import java.text.SimpleDateFormat;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName = "Estabelecimento")
public class Estabelecimento
{   
    @DatabaseField(generatedId = true)
    private String estabelecimento;
    
    @DatabaseField
    private int cnpj;
    
    @DatabaseField
    public int telefone;
    
    @DatabaseField
    public String endereco;
    
    public String getestabelecimento(){
        return this.estabelecimento;
    }
    
    public void setestabelecimento(String estabelecimento){
        this.estabelecimento = estabelecimento;

    }
    
    public int getcnpj(){
        return this.cnpj;
    }
    
    public void setcnpj(int cnpj){
        this.cnpj = cnpj;

    }
    
    public int gettelefone(){
        return this.telefone;
    }
    
    public void settelefone(int telefone){
        this.telefone = telefone;

    }
    
    public String getendereco(){
        return this.endereco;
    }
    
    public void setendereco(String endereco){
        this.endereco = endereco;

    }
}
    

    
