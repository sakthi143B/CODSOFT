
window.addEventListener("scroll", () => {
    const sections = document.querySelectorAll("section");
    sections.forEach((section) => {
        const sectionTop = section.getBoundingClientRect().top;
        const sectionInView = sectionTop < window.innerHeight - 50;
        if (sectionInView) {
            section.classList.add("in-view");
        }
    });
});
function toggleDetails(id) {
    const details = document.getElementById(id);
    const button = details.nextElementSibling;
    if (details.style.display === "none") {
        details.style.display = "block";
        button.innerText = "Show Less";
    } else {
        details.style.display = "none";
        button.innerText = "Show More";
    }
}
function openProjectModal(projectId) {
    const modal = document.getElementById("projectModal");
    const modalContent = document.getElementById("modalProjectContent");

    if (projectId === 'project1') {
        modalContent.innerHTML = `
            <h3>Vehicle Record System (VRS)</h3>
            <p>Comprehensive data management for vehicle records, with user-friendly interfaces and security-focused modules for both admins and users.</p>
        `;
    } else if (projectId === 'project2') {
        modalContent.innerHTML = `
            <h3>Food Ordering System</h3>
            <p>A web-based platform designed to optimize database management in food ordering, featuring streamlined processes and efficient data organization.</p>
        `;
    }

    modal.style.display = "block";
}

function closeProjectModal() {
    document.getElementById("projectModal").style.display = "none";
}
// Function for adding scroll animation effect
window.addEventListener("scroll", () => {
    const sections = document.querySelectorAll("section");
    sections.forEach((section) => {
        const sectionTop = section.getBoundingClientRect().top;
        const sectionInView = sectionTop < window.innerHeight - 50;
        if (sectionInView) {
            section.classList.add("in-view");
        }
    });

    // Apply animation for certificates
    const certificates = document.querySelectorAll(".certificate");
    certificates.forEach((certificate) => {
        const certTop = certificate.getBoundingClientRect().top;
        const certInView = certTop < window.innerHeight - 50;
        if (certInView) {
            certificate.classList.add("in-view");
        }
    });
});

