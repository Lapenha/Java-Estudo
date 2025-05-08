package Exs;

public class DiasDaSemanaEnum {

    public enum DiasDaSemana {
        SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA {
            @Override
            public boolean ehFinalDeSemana() {
                return false;
            }
        },
        SABADO {
            @Override
            public boolean ehFinalDeSemana() {
                return true;
            }
        },
        DOMINGO {
            @Override
            public boolean ehFinalDeSemana() {
                return true;
            }
        };

        public boolean ehFinalDeSemana() {
            return false; // padrão: dias úteis
        }
    }

    public static void main(String[] args) {
        for (DiasDaSemana dia : DiasDaSemana.values()) {
            if (dia.ehFinalDeSemana()) {
                System.out.println(dia + " é final de semana.");
            } else {
                System.out.println(dia + " é dia útil.");
            }
        }
    }
}
