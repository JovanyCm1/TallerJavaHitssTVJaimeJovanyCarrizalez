package sistemaDePedidos.clases;

public enum OrderStatus {
    NEW {
        @Override
        public String mensajeAsociado() {
            return "Pedido creado";
        }
    },
    PROCESSING {
        @Override
        public String mensajeAsociado() {
            return "Pedido en proceso";
        }
    },
    SHIPPED {
        @Override
        public String mensajeAsociado() {
            return "Pedido enviado";
        }
    },
    DELIVERED {
        @Override
        public String mensajeAsociado() {
            return "Pedido entregado";
        }
    },
    CANCELLED {
        @Override
        public String mensajeAsociado() {
            return "Pedido cancelado";
        }
    };

    public abstract String mensajeAsociado();
}
