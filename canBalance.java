// recursive backtracking
// supposed to do without a loop
public boolean canBalance(int target, List<Integer> weights) {
    // check if it's even possible
    int sumOfWeights = 0;
    for (int w : weights) {
        sumOfWeights += w;
    }
    if (sumOfWeights < target) {
        return false;
    }
    return canBalance(target, weights, 0, 0);
}

private boolean canBalance(int target, List<Integer> weights, int index, int currentSum) {
    if (currentSum == target) {
        return true;
    } else if (currentSum < target && index < weights.size() - 1) { // choose-explore-unchoose
        currentSum += weights.get(index);
        canBalance(target, weights, index++, currentSum);
        currentSum -= weights.get(index);
        return true;
    } else {
        return false;
    }
}
