public enum Size {
    XXS(32) {
        public String getDescription() {
            return "Child size";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    public String getDescription() {
        return "Adult size";
    }

    final int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }



}
