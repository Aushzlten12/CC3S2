require "operations"
describe Operations do
    describe ".sumar" do
        context "two numbers" do
            context "given 2,5" do
                it "return 7" do
                    expect(Operations.sumar(2,5)).to eql(7)
                end
            end
        end
    end
end