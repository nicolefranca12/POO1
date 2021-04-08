package com.company;

    public class Funcionario extends Pessoa {

    private double salario = 7000;
    private double salarioPrimeiraParcela = salario *0.6;
    private double salarioSegundaParcela = salario *0.4;
    private int matricula = 488999102;



        public int getMatricula() {
            return matricula;
        }

        public void setMatricula(int matricula) {
            this.matricula = matricula;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }



        private void salario() {
            if ( salario > 0) {
                this.salario();
            }

        }


        public double getSalarioPrimeiraParcela() {
            if (salario > 0) {
                this.salario();
                return (salario *0.6);
            }
            return salarioPrimeiraParcela;
        }

        public void setSalarioPrimeiraParcela(double salarioPimeiraParcela) {
            this.salarioPrimeiraParcela = salarioPimeiraParcela;
        }

        public double getSalarioSegundaParcela() {
            if (salario > 0){
                this.salario();
                return (salario *0.4);
            }
            return salarioSegundaParcela;
        }

        public void setSalarioSegundaParcela(double salarioSegundaParcela) {
            this.salarioSegundaParcela = salarioSegundaParcela;
        }

    }




