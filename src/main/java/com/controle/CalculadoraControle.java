package com.controle;

import com.formulario.FrmCalculadora;
import com.entidade.Calculadora;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Controlador da calculadora
 *
 * @author osmar
 */
@Controller
public class CalculadoraControle {

    /**
     * Carrega o arquivo "FrmCalculadora.html" do diretório templates como
     * default "/" do projeto.
     *
     * @param frmCalculadora
     * @param model
     * @return
     */
    @GetMapping("/")
    public String frmCalculadora(FrmCalculadora frmCalculadora, Model model) {
        //System.out.println("Executando getFrmCalculadora");
        //Objeto adicionado como atributo a página html
        model.addAttribute("frmCalculadora", frmCalculadora);
        return "FrmCalculadora";
    }

    @PostMapping("/getResultado")
    public String getResultado(FrmCalculadora frmCalculadora, Model model) {
        
        //Instancia e passa os valores para a calculadora
        Calculadora calculadora = new Calculadora(frmCalculadora.getValorA(), frmCalculadora.getValorB());
        
        //Verifica o tipo da operação
        double resultado = 0;
        if (frmCalculadora.getOperacao().equals("adicao")) {
            resultado = calculadora.getSoma();
            System.out.println("A = " + frmCalculadora.getValorA() + " + B = " + frmCalculadora.getValorB() + " Resultado: " + resultado);
        } else {
            if (frmCalculadora.getOperacao().equals("subtracao")) {
                resultado = calculadora.getDiferenca();
                System.out.println("A = " + frmCalculadora.getValorA() + " - B = " + frmCalculadora.getValorB() + " Resultado: " + resultado);

            } else {
                if (frmCalculadora.getOperacao().equals("multiplicacao")) {
                    resultado = calculadora.getProduto();
                    System.out.println("A = " + frmCalculadora.getValorA() + " * B = " + frmCalculadora.getValorB() + " Resultado: " + resultado);
                } else {
                    if (frmCalculadora.getOperacao().equals("divisao")) {
                        resultado = calculadora.getQuociente();
                        System.out.println("A = " + frmCalculadora.getValorA() + " / B = " + frmCalculadora.getValorB() + " Resultado: " + resultado);
                    }
                }
            }
        }
        
        //Atribui o resultado ao objeto do formulário
        frmCalculadora.setResultado(resultado);
        
        //System.out.println("Executando getResultado");
        model.addAttribute("frmCalculadora", frmCalculadora);
        return "Resultado";
    }
}
