
describe("A suite", function() {

    it("contains spec with an expectation", function() {
      expect(true).toBe(true);
    });

    describe("A suite in suite", function() {
        let helper = 1;

        beforeEach(function() {
            helper = 0;
          });
        
        it("inner spec ", function() {
            expect(helper).toBe(0);
          });
    });

});