package sistemaDePedidos.clases;

public enum OrderPriority {
    LOW {
        @Override
        public int numeroDeAtencion() {
            return 1;
        }
    },
    MEDIUM {
        @Override
        public int numeroDeAtencion() {
            return 2;
        }
    },
    HIGH {
        @Override
        public int numeroDeAtencion() {
            return 3;
        }
    };


    public abstract int numeroDeAtencion();
}
