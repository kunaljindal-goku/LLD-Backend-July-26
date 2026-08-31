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

    static void fillRegistry(VMInstanceRegistry vmInstanceRegistry) {
        VMInstance ubuntuInstance = new VMInstance("Ubuntu 22.4","Docker 1.2","Datadog",null,null);
        vmInstanceRegistry.addVmInstance("backend-server-v3",ubuntuInstance);

        VMInstance gpuInstance = new GpuVMInstance(new GpuVMInstance("Ubuntu 22.4","Docker 1.2","Datadog","scaler.com","123.41.23.12","Nvidia"));
        vmInstanceRegistry.addVmInstance("gpu-instance-v2",gpuInstance);

    }

    public static void main(String[] args) {


//
//        VMInstance instance1 = new VMInstance("Ubuntu 22.4","Docker 1.2","Datadog","scaler.com","123.41.23.12");
//
//        VMInstance copyInstance = instance1.clone();
//        System.out.println("DEBUG");
//
//        VMInstance gpuVMInstance = new GpuVMInstance("Ubuntu 22.4","Docker 1.2","Datadog","scaler.com","123.41.23.12","Nvidia");
//        VMInstance copy = gpuVMInstance.clone();

        VMInstanceRegistry vmInstanceRegistry = new VMInstanceRegistry();
        fillRegistry(vmInstanceRegistry);

        VMInstance kunalIntance = vmInstanceRegistry.getVmInstance("backend-server-v3");
        kunalIntance.setHostname("scaler.com");
        kunalIntance.setIpAddress("123.11.11.11");

        VMInstance armaanInstance = vmInstanceRegistry.getVmInstance("gpu-instance-v2");
        armaanInstance.setHostname("wdqd");
        armaanInstance.setIpAddress("2324");

        VMInstance macInsatnce = new VMInstance("MacOs 19.23","Docker 1.2","Datadog",null,null);
        vmInstanceRegistry.addVmInstance("mac-server-v1",macInsatnce);

        System.out.println("DEBUG");
    }
}
