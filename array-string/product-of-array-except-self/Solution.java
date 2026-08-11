class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) return new int[0];
        
        int n = nums.length;
        int[] res = new int[n];
        
        int prefixo = 1, sufixo = 1;
        
        // Primeiro pass: calcula o prefixo acumulado da direita pra esquerda
        for (int i = 0; i < n; i++) {
            res[i] = prefixo;
            prefixo *= nums[i];
        }
        
        // Segundo pass: aplica o sufixo acumulado de trás para frente
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= sufixo;
            sufixo *= nums[i];
        }
        
        return res;
    }
}
