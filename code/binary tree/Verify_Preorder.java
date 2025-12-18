class Verify_Preorder {

    public boolean isValidSerialization(String preorder) {
        // One slot for the root
        int slots = 1;

        String[] nodes = preorder.split(",");

        for (String node : nodes) {
            // Every node consumes one slot
            slots--;

            // If no slot is available, it's invalid
            if (slots < 0) {
                return false;
            }

            // Non-null node generates two new slots
            if (!node.equals("#")) {
                slots += 2;
            }
        }

        // All slots should be exactly used
        return slots == 0;
    }
}
