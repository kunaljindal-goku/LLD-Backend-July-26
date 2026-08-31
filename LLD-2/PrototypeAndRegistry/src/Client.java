public class Client {

    // violates OCP
//    static void createCopy(VMInstance vmInstance) {
//        VMInstance copy = null;
//        if(vmInstance instanceof VMInstance) {
//            copy = new VMInstance(vmInstance);
//        }
//        else if(vmInstance instanceof GpuVMInstance) {
//            copy = new GpuVMInstance((GpuVMInstance)vmInstance);
//        }
//    }

    public static void main(String[] args) {
        VMInstance instance1 = new VMInstance("Ubuntu 22.4","Docker 1.2","Datadog","scaler.com","123.41.23.12");

        VMInstance copyInstance = instance1.clone();
        System.out.println("DEBUG");

        VMInstance gpuVMInstance = new GpuVMInstance("Ubuntu 22.4","Docker 1.2","Datadog","scaler.com","123.41.23.12","Nvidia");
        VMInstance copy = gpuVMInstance.clone();


    }
}
