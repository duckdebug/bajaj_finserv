describe('Bajaj Finsev',()=>{
    it('Testcase1',()=>{
        cy.visit('https://www.google.com/');
        cy.get('.gLFyf').click();
        cy.get('.gLFyf').clear();
    })
    it('Search on Google',()=>{
        cy.get('.gLFyf').type('Bajaj FInserv Health Limited{enter}');
        cy.get('#rso > div:nth-child(1) > div > div > div.NJo7tc.Z26q7c.jGGQ5e > div > a > h3').click();
        cy.get('#searchBarInput').clear();
    });
    it('Search Doctor',()=>{
        cy.get('#searchBarInput').type('Doctor{enter}');
    });
    it('Click first result',()=>{
        cy.get('#__next > div.css-dgynh5 > div:nth-child(5) > div.css-1lwfv71 > div > div.css-1q66mfy > div.css-apwxfg > div > div:nth-child(1) > a > div > div.css-1k1y8li > button.css-1ss0a6s').click();
    });
    it('Click slot',()=>{
        cy.get('[href="/appointment/review?doctor=indore%2Fdietitian-nutritionist%2Fdr-preeti-shukla&duration=15&date=2022-06-03T00%3A00%3A00%2B05%3A30&time=18%3A00%3A00&type=econsult&offer=DISC100&offerid=v_AOscpP1RjO8qAGh6s8CKSrN6wsXo0yBS"] > .MuiButtonBase-root > .MuiButton-label').click();
    });
});

    //  Check details on appointment review page option not visible until user loggedin
