double disabilityAmount() {
  if (seniority < 2 ||monthsDisabled > 12 || isPartTime) {
    return 0;
  }
 
}