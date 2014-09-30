package grails.play

class Company {

    BigDecimal cash
    BigDecimal receivables
    BigDecimal capital
    BigDecimal netWorth
    
    static mapping = {
        netWorth formula: 'CASH + RECEIVABLES + CAPITAL'
    }
}
