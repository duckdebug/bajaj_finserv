describe('Amazon',()=>{
    const pom = {}
    it('Search Iphone12',()=>{
        cy.visit('https://www.amazon.in/');
        cy.get('#nav-link-accountList-nav-line-1').trigger('mousehover');
        cy.contains('Sign').click({force:true});
        cy.url().should('include','signin');
        cy.get('#ap_email').type('shikhaattar@gmail.com');
        cy.get('#continue').click();
        cy.get('#ap_password').type('if u want me');
        cy.get('#authportal-main-section > div:nth-child(2) > div.a-section.a-spacing-base > div > div > form > div > div:nth-child(7) > div > div > label > div > label > input[type=checkbox]').click();
        cy.get('#signInSubmit').click(); 
        cy.get('#searchDropdownBox')
        cy.get('#twotabsearchtextbox').click().get('#searchDropdownBox').select('Electronics',{force: true});  
        cy.get('#twotabsearchtextbox').type('Iphone 12{enter}');;
        
    })
    it('Add to Cart -Invoke child tab',()=>{
        cy.get("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] a[class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")
        .invoke("removeAttr", "target").click();
        cy.get('#add-to-cart-button').click();
        cy.get('#attach-sidesheet-view-cart-button > span > input').click();
        
    })
})