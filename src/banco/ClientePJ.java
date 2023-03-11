/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author FACOM
 */
public class ClientePJ extends Cliente {

    private String CNPJ;
    
    public ClientePJ(String nometitular, String CNPJ) {
        super(nometitular);
        this.CNPJ = CNPJ;
    }
  
    
    
}
