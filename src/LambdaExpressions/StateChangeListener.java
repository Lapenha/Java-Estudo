package LambdaExpressions;

 interface StateChangeListener {void onStateChange(String oldState, String newState);}
//interface com um unico metodo

//classe para usar o listener
class StateOwner {
     public void addStateListener(StateChangeListener listener) {
         //simulando a mudança de estado
         listener.onStateChange("OFF", "ON");
     }
}
//execucao
 class RealUseCase {
    public static void main(String[] args) {
        StateOwner stateOwner = new StateOwner();
            stateOwner.addStateListener((oldState, newState) -> {
                System.out.println("Estado alterado de " + oldState + " para " + newState);
            });
    }
}

