package org.example.item18.callback;

public class Service {

    public void run(FunctionToCall functionToCall) {
        System.out.println("뭐 좀 하다가..");
        functionToCall.call();
    }

    public static void main(String[] args) {
        Service service = new Service();
        BobFunction function = new BobFunction(service);
//        function.run();

        BobFunctionWrapper wrapper = new BobFunctionWrapper(function);
        wrapper.call();
    }

}
